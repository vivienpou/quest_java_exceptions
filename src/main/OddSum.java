import java.util.ArrayList;

public class OddSum {

    public static void main(String[] args) {
        run(args, false);
    }

    public static int run(String[] args, boolean test) {

        ArrayList<Integer> listInt = new ArrayList<>();
        int res;
        if (!test) {
            System.out.println("Elements' list :");
            for (String v : args)
                System.out.print(" " + v);
            System.out.println();
        }
        for (int i = 0; i < args.length; i++) {
			if(!isNumeric(args[i])){
				listInt.clear();
				listInt.add(- 1);
				break;
			}
        	if(isNumeric(args[i])){
				listInt.add(Integer.parseInt(args[i]));
			}
        }

        res = sum(listInt);
        if (test) {
            return res;
        }

        System.out.println("Sum of odd elements : " + res);
        System.out.println("END!");

        return 0;
    }

    public static int sum(ArrayList<Integer> listInt) {

        int result = 0;
        for (int value : listInt) {
            if (value % 2 != 0) {
                result += value;
            }
        }
        return result;
    }

	public static boolean isNumeric(String strNum) {
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
}
