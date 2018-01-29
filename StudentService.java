package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping(value="/rest/student")
class UserService{
 
   @RequestMapping(value="/",method = RequestMethod.GET)
   public Map<String, ArrayList<UserDetails>> getAllUsers(){
      return Application.hmUser;
   }
}