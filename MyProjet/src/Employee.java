import java.util.Objects;

public class Employee {
		
		private int addrId;
		private String strAddr;
		private String city;
		private String region;
		private String postal_code;
		private Employee resident;
		
		public Employee(int addrId, String strAddr, String city, String region, String postal_code, Employee resident) {
			super();
			this.addrId = addrId;
			this.strAddr = strAddr;
			this.city = city;
			this.region = region;
			this.postal_code = postal_code;
			this.resident = resident;
		}
		
		public Employee() {
			super();
		}
		
		public Employee(String strAddr, String city, String region, String postal_code, Employee resident) {
			super();
			this.strAddr = strAddr;
			this.city = city;
			this.region = region;
			this.postal_code = postal_code;
			this.resident = resident;
		}

		public int getAddrId() {
			return addrId;
		}

		public void setAddrId(int addrId) {
			this.addrId = addrId;
		}

		public String getStrAddr() {
			return strAddr;
		}

		public void setStrAddr(String strAddr) {
			this.strAddr = strAddr;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getRegion() {
			return region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public String getPostal_code() {
			return postal_code;
		}

		public void setPostal_code(String postal_code) {
			this.postal_code = postal_code;
		}

		public Employee getResident() {
			return resident;
		}

		public void setResident(Employee resident) {
			this.resident = resident;
		}

		@Override
		public int hashCode() {
			return Objects.hash(addrId, city, postal_code, region, resident, strAddr);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return addrId == other.addrId && Objects.equals(city, other.city)
					&& Objects.equals(postal_code, other.postal_code) && Objects.equals(region, other.region)
					&& Objects.equals(resident, other.resident) && Objects.equals(strAddr, other.strAddr);
		}

		@Override
		public String toString() {
			return "Address [addrId=" + addrId + ", strAddr=" + strAddr + ", city=" + city + ", region=" + region
					+ ", postal_code=" + postal_code + ", resident=" + ((resident!=null)?resident.getResident():null) + "]";
		}
		
		

	}