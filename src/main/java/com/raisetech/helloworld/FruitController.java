package com.raisetech.helloworld;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
public class FruitController {
    @GetMapping("/test")
    public String displayFruit(@RequestParam(required = false) String fruit) {
        Map<String, Integer> priceByName = Map.of("apple", 100, "orange", 150, "grape", 500);
        String message = "登録されているフルーツをパラメータに設定してください。";
        String price = "";

        if (priceByName.containsKey(fruit)) {
            price = priceByName.get(fruit).toString();
            message = fruit + "の値段は" + price + "円です";
        }


        return message;
    }
}
