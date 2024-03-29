package calcEngine;

public class Main {
	
	public static void main(String[] args) {
//		MathEquation testEquation = new MathEquation();
//		testEquation.execute();
//		System.out.print("test=");
//		System.out.println(testEquation.getResult());
		
//		useMathEquation();
//		useCalculatorBase();
//		useCalculateHelper();
		
		String[] statements = {
				"add 25.0 92.0",   // 25.0 + 92.0 = 117.0
				"power 5.0 2.0"    //5.0 ^ 2.0 = 25.0
		};
		DynamicHelper helper = new DynamicHelper(new MathProcessing[] {
			new Adder(),
			new PowerOf()
		});
		for (String statement : statements) {
			String output = helper.process(statement);
			System.out.println(output);
		}
	}
		
		static void useCalculateHelper() {
			String[] statements = {
		
				"add 1.0", // error: incorrect number of values
				"add xx 25.0", // error: non-numeric data
				"addX 0.0 0.0",// error: invalid command
				"divide 100.0 50.0", // 100.0 / 50.0 = 2.0
				"add 25.0 92.0",	// 25.0 + 92.0 = 117.0
				"subtract 225.0 17.0", // 225.0 - 17.0 = 208.0
				"multiply 11.0 3.0" 	// 11.0 * 3.0 = 33.0
		};
		CalculateHelper helper = new CalculateHelper();
			for(String statement : statements) {
				try {
				helper.process(statement);
				System.out.println(helper);
				} catch(InvalidStatementException e) {
					System.out.println(e.getMessage());
					if(e.getCause()!= null)
						System.out.println(" Original exception: " + e.getCause().getMessage() );
				}
			}
//	
//	static void useMathEquation() {
//		MathEquation[] equations = new MathEquation[4];
//		equations[0] = new MathEquation('d', 100.0d, 50.0d);
//		equations[1] = new MathEquation('a', 25.0d, 92.0d);
//		equations[2] = new MathEquation('s', 225.0d, 17.0d);
//		equations[3] = new MathEquation('m', 11.0d, 3.0d);
//		
//		for(MathEquation equation : equations) {
//			equation.execute();
//			System.out.print("result = ");
//			System.out.println(equation.getResult());
//		}
//		
//		
//		System.out.println();
//		System.out.println("Using Overloads");
//		System.out.println();
//		
//		double leftDouble =  9.0d;
//		double rightDouble = 4.0d;
//		int leftInt = 9;
//		int rightInt =  4;
//		
//		MathEquation equationOverload = new MathEquation('d');
//		
//		equationOverload.execute(leftDouble, rightDouble);
//		System.out.print("result=");
//		System.out.println(equationOverload.getResult());
//		
//		equationOverload.execute(leftInt, rightInt);
//		System.out.print("result=");
//		System.out.println(equationOverload.getResult());
//		
//		
//		equationOverload.execute((double)leftInt, rightInt);
//		System.out.print("result=");
//		System.out.println(equationOverload.getResult());
//		
//		System.out.println();
//		System.out.println("Using Inheritance");
//		System.out.println();
//		
//		CalculateBase[] calculators = {
//				new Divider(100.0d, 50.0d),
//				new Adder(25.0d, 92.0d),
//				new Subtracter(225.0d, 17.0d),
//				new Multiplier(11.0d, 3.0d)
//		};
//		
//		for(CalculateBase calculator : calculators) {
//			calculator.calculate();
//			System.out.print("result=");
//			System.out.println(calculator.getResult());
//		}
	/*	double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'d', 'a', 's', 'm'};
		double[] results = new double[opCodes.length];
		double val1 = 100.0d;
		double val2 = 50.0d;
		double result;
		char opCode = 'd';
		
		for(int i = 0; i < opCodes.length; i++) {	
			if(opCodes[i] == 'a')
				results[i] = leftVals[i] + rightVals[i];
		else if(opCodes[i] == 's')
			results[i] = leftVals[i] - rightVals[i];
		
		else if(opCodes[i] == 'd') {
			results[i] = rightVals[i] != 0.0d ? leftVals[i] / rightVals[i] : 0.0d;
			
			if(val2 != 0.0d)
			result = val1 /  val2;
			else
				result = 0.0d;
		}
		else if(opCodes[i] == 'm') {
			results[i] = leftVals[i] * rightVals[i];
		}
		else {
			System.out.println("Error - invalid opCode");
			results[i] = 0.0d;
		}
		}
			for(double theResult : results) {
		System.out.print("result = ");
		System.out.println(theResult);		
			}*/
	}
	
	/*public static MathEquation create(double leftVal, double rightVal, char opCode) {
		MathEquation equation = new MathEquation();
		equation.setLeftVal(leftVal);
		equation.setRightVal(rightVal);
		equation.setOpCode(opCode);
		
		return equation;
	}
*/
}
