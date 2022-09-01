package br.com.pamela.payrollapi.feignClients;

import br.com.pamela.payrollapi.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "user-api")
public interface UserFeign {

    @GetMapping(value = "/api/users/{id}")
    ResponseEntity<User> findById(@PathVariable Long id);

    @GetMapping(value = "")
    ResponseEntity<List<User>> findAll();

}
