package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {
    @GetMapping("/error")
    public String getError() {return "/html/error.jsp";}

    @GetMapping("/signIn")
    public String getSignIn() { return "/jsp/signIn.jsp"; }

    @GetMapping("/index")
    public String getIndex() {return "index";}

    @GetMapping("/admin/{view}")
    public void getView2() {}

//	@GetMapping("/{root}/{view}")
//	public void getView2() {}
//	@GetMapping("/{root}/{root2}/{view}")
//	public void getView3() {}
}
