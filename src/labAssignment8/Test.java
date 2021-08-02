package labAssignment8;


import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		
		Set<BankAccount> bankAccountHashSet = new HashSet<>(); // HashSet of the bankAccounts
		
		Set<BankAccount> bankAccountTreeSet = new TreeSet<>(); // TreeSet of the bankAccounts
		
		/**
		 * Creating objects of BankAccount and then adding them to
		 * the hashSet and treeSet.
		 */
		
		BankAccount ba1 = new BankAccount(123000, 321000);
		bankAccountHashSet.add(ba1);
		bankAccountTreeSet.add(ba1);
		
		BankAccount ba2 = new BankAccount(555000, 555000);
		bankAccountHashSet.add(ba2);
		bankAccountTreeSet.add(ba2);
		
		BankAccount ba3 = new BankAccount(555000, 555000); // this should not be repeated in the set as ba2 is the same object
		bankAccountHashSet.add(ba3);
		bankAccountTreeSet.add(ba3);
		
		BankAccount ba4 = new BankAccount(123000, 321000); // copy of ba1
		bankAccountHashSet.add(ba4);
		bankAccountTreeSet.add(ba4);
		
		BankAccount ba5 = new BankAccount(125000, 521000); // copy of ba1
		bankAccountHashSet.add(ba5);
		bankAccountTreeSet.add(ba5);
		
		BankAccount ba6 = new BankAccount(223000, 322000); // copy of ba1
		bankAccountHashSet.add(ba6);
		bankAccountTreeSet.add(ba6);
		
		
		
		/**
		 * Printing to showcase the implementation of the hashCode() & equals() method in bankAccount Class
		 */
		
		System.out.println("Checking if ba1 & ba4 are same object using equalMethod: " + ba1.equals(ba4));
		
		System.out.println("Checking if ba2 & ba3 are same object using equalMethod: " + ba2.equals(ba3));

		System.out.println("hashCode for ba1: " + ba1.hashCode() + " And hashCode for ba4: " + ba4.hashCode());
		
		System.out.println("hashCode for ba2: " + ba2.hashCode() + " And hashCode for ba3: " + ba3.hashCode());
		
		
		/**
		 * Printing the HashSet and treeSet of the BankAccounts one by one
		 * And Taking the count of the objects inserted in the sets.
		 */
		
		System.out.println("====================================================");
		System.out.println("Printing the Hash Set");
		System.out.println(bankAccountHashSet.size());
		
		for(BankAccount b: bankAccountHashSet) {
			System.out.println("Bank account no. : " + b.getAccountNumber() 
								+ "\n"
								+ "Sort Code : " + b.getSortCode());
		}
		System.out.println("====================================================");
		
		System.out.println("Printing the Tree Set");
		System.out.println(bankAccountTreeSet.size());
		for(BankAccount b: bankAccountTreeSet) {
			System.out.println("Bank account no. : " + b.getAccountNumber() 
								+ "\n"
								+ "Sort Code : " + b.getSortCode());
		}
		System.out.println("====================================================");
	}

}
