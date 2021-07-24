package com.xworkz.mahesh.Collection.Tester;

	import com.xworkz.dataStore.dto.RiverDTO;
	import com.xworkz.dataStore.dto.dao.RiverDAO;
	import com.xworkz.dataStore.dto.dao.RiverDAOImpl;


		public static void main(String[] args) {

			RiversDTO dto = new RiversDTO("Kaveri", "Talakaveri", 805, 4, true);

			RiversDTO dto1 = new RiversDTO("Sharavathi", "Amboothirtha", 165, 1, true);

			RiversDAO dao = new RiversDAOImpl();
			dao.save(dto);
			dao.save(dto1);

			System.out.println(dao.totalItems());

			RiversDTO kaveriupdate = new RiversDTO("Cauvery", "TalaKaadu", 808, 4, true);
			dao.update(kaveriupdate);
			System.out.println("total items" + dao.totalItems());

			RiversDTO deletedto = new RiversDTO("Sharavathi", "Kundadri", 198, 1, true);
			dao.delete(deletedto);
			System.out.println(dao.totalItems());
			
			RiversDTO dt = dao.findByName("Kaveri");
			System.out.println(dt);

		}

	


