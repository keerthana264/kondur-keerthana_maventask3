package com.epam.layered;
public class CustomerRepository {
	**Application Layer**/
	/**the mapper class to transform Entity model to DTO.**/
		@Repository
		public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
		    
		    CustomerEntity findByUsername(String username);
		    
		}

}
