package labAssignment8;

import java.util.Objects;

public class BankAccount implements Comparable<BankAccount> {
	
	protected Integer accountNumber;
	
	protected Integer sortCode;

	public Integer getSortCode() {
		return sortCode;
	}

	public Integer getAccountNumber() {
		return accountNumber;
	}
	
	
	/**
	 * Implemetation of hashCode method and it returns the hash of the object created.
	 */
	@Override
	public int hashCode() {
		return Objects.hash(accountNumber, sortCode);
	}

	/**
	 * Implementing equals method to check whether the created object is a duplication of previously created object
	 * This will help in the better implementation of sets of this type.
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		return Objects.equals(accountNumber, other.accountNumber) && Objects.equals(sortCode, other.sortCode);
	}

	public BankAccount(Integer accountNumber, Integer sortCode) {
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
	}

	@Override
	public int compareTo(BankAccount bankAccount) {
		// TODO Auto-generated method stub
		if(sortCode > bankAccount.sortCode) {
			return 1;
		} else if(sortCode < bankAccount.sortCode) {
			return -1;
		} else {
			return 0;
		}
	}
}
