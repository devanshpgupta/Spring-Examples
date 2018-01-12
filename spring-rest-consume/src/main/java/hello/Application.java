package hello;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        /*Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);
        System.out.println("Name:    " + page.getName());
        System.out.println("About:   " + page.getAbout());
        System.out.println("Phone:   " + page.getPhone());
        System.out.println("Website: " + page.getWebsite());*/
        
        WeatherInfo weatherInfo = restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?zip=94040,us&appid=e886d3974863316d2a9278dc9f2db447", WeatherInfo.class);
        System.out.println(weatherInfo);
        for(int i=0;i<weatherInfo.getWeather().length;i++)
        		System.out.println(weatherInfo.getWeather()[i]);
        //System.out.println(weatherInfo.getDescription());
    }

}