package com.mysite.sf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SfController {
	
    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }
    
    @GetMapping("/index")
    public String index(Model model) {
    	model.addAttribute("title", "SoulFood");
        return "index";
    }
    
    @GetMapping("/info")
    public String info(Model model) {
    	model.addAttribute("title", "소개");
        return "info";
    }

    @GetMapping("/age1")
    public String age1(Model model) {
        model.addAttribute("title", "10대 맛집");
        return "age1";
    }
    @GetMapping("/age2")
    public String age2(Model model) {
        model.addAttribute("title", "20대 맛집");
        return "age2";
    }

    @GetMapping("/age3")
    public String age3(Model model) {
        model.addAttribute("title", "30대 맛집");
        return "age3";
    }

    @GetMapping("/age4")
    public String age4(Model model) {
        model.addAttribute("title", "40대 맛집");
        return "age4";
    }

    @GetMapping("/age5")
    public String age5(Model model) {
        model.addAttribute("title", "50대 맛집");
        return "age5";
    }

    @GetMapping("/korean")
    public String korean(Model model) {
        return "korean";
    }
    
    @GetMapping("/japanes")
    public String japanes(Model model) {
        model.addAttribute("title", "일식");
        return "japanes";
    }
    
    @GetMapping("/chinese")
    public String chinese(Model model) {
        model.addAttribute("title", "중식");
        return "chinese";
    }
    
    @GetMapping("/western")
    public String western(Model model) {
        model.addAttribute("title", "양식");
        return "western";
    }
    
    @GetMapping("/seoul")
    public String seoul(Model model) {
        model.addAttribute("title", "서울");
        return "seoul";
    }
    @GetMapping("/incheon")
    public String incheon(Model model) {
        model.addAttribute("title", "인천");
        return "incheon";
    }
    @GetMapping("/busan")
    public String busan(Model model) {
        model.addAttribute("title", "부산");
        return "busan";
    }
    @GetMapping("/jeju")
    public String jeju(Model model) {
        model.addAttribute("title", "제주");
        return "jeju";
    }
    
    @GetMapping("/honey")
    public String honey(Model model) {
    	model.addAttribute("title", "허니돈");
        return "honey";
    }
    
    @GetMapping("/lee")
    public String lee(Model model) {
        model.addAttribute("title", "이촌성모메존칼국수");
        return "lee";
    }
    
    @GetMapping("/nanpo")
    public String nanpo(Model model) {
        model.addAttribute("title", "난포");
        return "nanpo";
    }
    
    @GetMapping("/ouk")
    public String ouk(Model model) {
        model.addAttribute("title", "우래옥");
        return "ouk";
    }
    @GetMapping("/dawon")
    public String dawon(Model model) {
        model.addAttribute("title", "다원국수");
        return "dawon";
    }
    @GetMapping("/aesung")
    public String aesung(Model model) {
        model.addAttribute("title", "애성회관한우곰탕");
        return "aesung";
    }
    @GetMapping("/donburi")
    public String donburi(Model model) {
        model.addAttribute("title", "돈부리");
        return "donburi";
    }
    @GetMapping("/hamjibak")
    public String hamjibak(Model model) {
        model.addAttribute("title", "함지박");
        return "hamjibak";
    }
    @GetMapping("/hidirao")
    public String hidirao(Model model) {
        model.addAttribute("title", "하이디라오");
        return "hidirao";
    }
    @GetMapping("/jinjuzip")
    public String jinjuzip(Model model) {
        model.addAttribute("title", "진주집");
        return "jinjuzip";
    }
    @GetMapping("/mdkj")
    public String mdkj(Model model) {
        model.addAttribute("title", "명동교자 본점");
        return "mdkj";
    }
    @GetMapping("/olenoramen")
    public String olenoramen(Model model) {
        model.addAttribute("title", "오레노라멘");
        return "olenoramen";
    }
    @GetMapping("/ljmpz")
    public String ljmpz(Model model) {
        model.addAttribute("title", "이재모피자");
        return "ljmpz";
    }
    @GetMapping("/lplkbg")
    public String lplkbg(Model model) {
        model.addAttribute("title", "르프리크 버거");
        return "lplkbg";
    }
    @GetMapping("/ppz")
    public String ppz(Model model) {
        model.addAttribute("title", "피플즈");
        return "ppz";
    }
    @GetMapping("/cdga")
    public String cdga(Model model) {
        model.addAttribute("title", "칠돈가");
        return "cdga";
    }

    @GetMapping("/layout")
    public String layout() {
        return "layout";
    }
    
    @GetMapping("/terms")
    public String terms() {
        return "terms";
    }
    
    @GetMapping("/privacy")
    public String privacy() {
        return "privacy";
    }

    @PostMapping("/search")
    public String search(@RequestParam("search") String search, Model model) {
        // 검색 결과 처리 로직을 여기에 작성
        model.addAttribute("searchTerm", search);
        return "search";
    }
}