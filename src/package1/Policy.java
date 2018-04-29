package package1;

public class Policy {
	
	private final Integer a1;
	
	private final String a2;
	
	private Policy(Builder builder) {
		a1 = builder.a1;
		a2 = builder.a2;
		
	}
	
	
	public Integer getA1() {
		return a1;
	}


	public String getA2() {
		return a2;
	} 


	public static class Builder{
		
		private  Integer a1;
		
		private String a2;
		
		public Builder() {
			
		}
		
		public Builder witha1(final Integer a1) {
			this.a1 = a1;
			return this;
		}
		public Builder witha2(final String a2) {
			this.a2 = a2;
			return this;
		}
		
		public Policy build() {
			
			if(this.a1 == null) {
			throw new IllegalStateException("a1 was null");	
			}
			return new Policy(this);
		}
		
	}
	

}
