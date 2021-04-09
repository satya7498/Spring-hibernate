package in.stack.hibernatedemo.util;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.mapping.MetadataSource;

public class HibernateUtil {
private static StandardServiceRegistry registry;
private static SessionFactory factory;
public static SessionFactory getSessionFactory() {
	
	if(factory==null) {
			try {
				registry =new StandardServiceRegistryBuilder().configure().build();
				
			MetadataSources sources =new MetadataSources(registry);
			Metadata metadata=sources.getMetadataBuilder().build();
			
			factory=metadata.getSessionFactoryBuilder().build();
		   }
		catch(Exception e)
		{
			e.printStackTrace();
			if(registry!=null) {
				StandardServiceRegistryBuilder.destroy(registry);
			}
			
		}
			
		}
	
	return factory;
}
	public static void shutdown() {
		if(registry!=null) {
			StandardServiceRegistryBuilder.destroy(registry);
			
		
	}
}


}
