package com.epam.layered;
public class CustomerService {

	
	/**we can add our Data Layer that will be our connection to the database**/
	/**Data Layer**/

		@Component
		class CustomerMapper {
		  
		  public CustomerAddMoneyDto mapToDto(CustomerEntity customerEntity) {
		    CustomerAddMoneyDto dto = new CustomerAddMoneyDto();
		    dto.username = customerEntity.getUsername();
		    dto.moneyAmount = customerEntity.getMoneyAmount();
		    return dto;
		  }
		  
		}

		@Service
		@AllArgsConstructor
		class CustomerService {
		  
		  private final CustomerRepository customerRepository;
		  private final CustomerMapper customerMapper;
		  
		  public CustomerAddMoneyDto addFundsToCustomer(
		    CustomerAddMoneyDto dto) {
		  
		    CustomerEntity customerEntity = customerRepository.findByUsername(dto.getUsername());
		    customerEntity.moneyAmount += dto.getMoneyAmount();
		    return customerMapper.mapToDto(customerRepository.save(customerEntity));
		  }
		  
}
}