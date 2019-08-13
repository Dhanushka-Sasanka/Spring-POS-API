/**
 * created by Dhanush
 *
 * @since Aug/2019
 **/

package com.springpos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/log")
public class LoginController {

    @RequestMapping(value = "/login")
    @ResponseBody
    private String login() {
        return "spring hello";
    }
}
