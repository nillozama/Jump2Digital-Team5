package com.j2digital.team5.security.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.j2digital.team5.exceptions.AttributeException;
import com.j2digital.team5.security.domain.User;
import com.j2digital.team5.security.dto.CreateUserDto;
import com.j2digital.team5.security.dto.JwtTokenDto;
import com.j2digital.team5.security.dto.LoginUserDto;
import com.j2digital.team5.security.dto.Rol;
import com.j2digital.team5.security.jwt.JwtProvider;
import com.j2digital.team5.security.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepo;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Autowired
	JwtProvider jwtProvider;

	@Autowired
	AuthenticationManager authenticationManager;
	

	public User create(CreateUserDto dto) throws AttributeException {
		if (userRepo.existsByUsername(dto.getUsername()))
			throw new AttributeException("username already in use");

		return userRepo.save(mapUserFromDto(dto));
	}
	
	private User mapUserFromDto(CreateUserDto dto) {

		String password = passwordEncoder.encode(dto.getPassword());
		List<Rol> roles = dto.getRoles().stream().map(rol -> Rol.valueOf(rol)).collect(Collectors.toList());
		return new User(dto.getUsername(), password, roles);
	}
	
	
	public JwtTokenDto login(LoginUserDto dto) {
		Authentication authentication = authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
		SecurityContextHolder.getContext().setAuthentication(authentication);
		String token = jwtProvider.generateToken(authentication);
		return new JwtTokenDto(token);
	}

	public Optional<User> getUser(String name) {
		return userRepo.findByUsername(name);
	}
	public User saveUser(User usuario) {
		return userRepo.save(usuario);
	}
	public List<User> getAllUsers(){
		return userRepo.findAll();
	}
}