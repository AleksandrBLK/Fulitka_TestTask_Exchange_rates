package exchange_rates.controller;


import exchange_rates.domain.dto.currencylayerResponseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Controller
public class MainController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${api.access.key}")
    private String apiAccessKey;

    @Value("${currencies}")
    private String currencies;

    @GetMapping("/")
    public String greeting(Map<String, Object> model) {

        return "greeting";
    }


    @GetMapping("/main")
    public String main(Model model) {
        String requestUrl = "http://api.currencylayer.com/live?access_key=" + apiAccessKey + "&currencies=" + currencies;
        currencylayerResponseDto response = restTemplate.getForObject(requestUrl, currencylayerResponseDto.class);
        if (response.isSuccess()) {
            model.addAttribute("currrency", response.getQuotes());
        }

        return "main";
    }


}
