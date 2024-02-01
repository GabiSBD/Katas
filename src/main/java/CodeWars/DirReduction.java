package CodeWars;

import java.util.*;

public class DirReduction {
    public static String[] dirReduc(String[] arr) {

        ArrayList<String> result = new ArrayList<>(List.of(arr));

        Map <String,String> opposites = new HashMap<>();
        opposites.put("NORTH", "SOUTH");
        opposites.put("SOUTH", "NORTH");
        opposites.put("EAST", "WEST");
        opposites.put("WEST", "EAST");

        boolean repeat = true;
        int first = 0;
        int second = 1;
        while (repeat){

            if(second != result.size() && result.get(second).equals(opposites.get(result.get(first)))) {
                result.remove(first);
                result.remove(first);
                if(result.isEmpty()) repeat = false;
                first = 0;
                second =1;
            }
            else if(first == result.size()-1) repeat = false;
            else {
                first+=1;
                second+=1;
            }
        }

        return result.toArray(String[]::new);
    }

    /* Funciona pero no era lo que se pedía este elimina los registros si aparece en alguna parte de la colecion su contrario, si el camino da vueltas y acaba en el punto
    inicial no escribe ninguna direción solo abrevia direciones que acaban en otro punto distinto al inicial.*/

//        public static String[] dirReduc(String[] arr) {
//            // Your code here.
//             List<String> result = new ArrayList<>();
//             Map <String,String> opposites = new HashMap<>();
//             opposites.put("NORTH", "SOUTH");
//             opposites.put("SOUTH", "NORTH");
//             opposites.put("EAST", "WEST");
//             opposites.put("WEST", "EAST");
//
//             int count;
//             int opposite;
//
//             for(String dir : arr){
//
//                 count = Long.valueOf(Arrays.stream(arr).filter(a->a.equals(dir)).count()).intValue();
//                 opposite = Long.valueOf(Arrays.stream(arr).filter(b-> b.equals(opposites.get(dir))).count()).intValue();
//                 count -= opposite;
//
//                 if(count > 0 && !result.contains(dir)) for(int e=0; e<count; e++) result.add(dir);
//
//             }
//
//            return result.toArray(String[]::new);
//        }

//Solucion prestada de SithFire
//    public static String[] dirReduc(String[] arr) {
//        final Stack<String> stack = new Stack<>();
//
//        for (final String direction : arr) {
//            final String lastElement = stack.size() > 0 ? stack.lastElement() : null;
//
//            switch(direction) {
//                case "NORTH": if ("SOUTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//                case "SOUTH": if ("NORTH".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//                case "EAST":  if ("WEST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//                case "WEST":  if ("EAST".equals(lastElement)) { stack.pop(); } else { stack.push(direction); } break;
//            }
//        }
//        return stack.toArray(String[]::new);
//    }



}
