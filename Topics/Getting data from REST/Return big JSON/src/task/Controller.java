package task;

import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class Controller {

  
    List<Color> colors = List.of(
            new Color("black", "hue", "primary", new Code(new ArrayList<Integer>(Arrays.asList(0,0,0,1)), "#000")),
            new Color("white", "value", "primary", new Code(new ArrayList<Integer>(Arrays.asList(255,255,255,1)), "#FFF"))
    );

    @GetMapping("/colors")
    public Map<String, List<Color>> getColorList(){
        Map<String, List<Color>> map = new HashMap<>();
        map.put("colors", colors);
        return map;
    }




    class Color {
        String color;
        String category;
        String type;
        Code code;

        public Color(String color, String category, String type, Code code) {
            this.color = color;
            this.category = category;
            this.type = type;
            this.code = code;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Code getCode() {
            return code;
        }

        public void setCode(Code code) {
            this.code = code;
        }
    }

    class Code {
        List<Integer> rgba = null;
        String hex;

        public Code(List<Integer> rgba, String hex) {
            this.rgba = rgba;
            this.hex = hex;
        }

        public List<Integer> getRgba() {
            return rgba;
        }

        public void setRgba(List<Integer> rgba) {
            this.rgba = rgba;
        }

        public String getHex() {
            return hex;
        }

        public void setHex(String hex) {
            this.hex = hex;
        }
    }

}
