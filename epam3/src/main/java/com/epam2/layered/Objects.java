package com.epam.layered;
public class Objects {

	
	/**: Data Transfer Objects, Domain Objects, Entity Objects.**/
		class CustomerAddMoneyDTO {
			  
			  public String username;
			  public Integer moneyAmount;
			  
			}

			class Customer {
			  
			  public String username;
			  public String password;
			  public String moneyAmount;
			  
			}

			@Entity
			@Table(name="CUSTOMER")
			class CustomerEntity {
			  
			  @Id
			  @GeneratedValue(strategy=GenerationType.AUTO)
			  public Long id;
			   
			  @Column(name="USERNAME")
			  public String username;
			  
			  @Column(name="PASSWORD")
			  public String password;
			  
			  @Column(name="MONEY_AMOUNT")
			  public Integer moneyAmount;
			  
			}

	}
	
	
	

