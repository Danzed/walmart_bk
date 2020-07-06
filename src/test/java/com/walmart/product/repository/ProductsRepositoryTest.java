package com.walmart.product.repository;

import static org.assertj.core.api.Assertions.assertThat;

// import com.mongodb.BasicDBObjectBuilder;
// import com.mongodb.DBObject;
// import com.mongodb.client.MongoClient;
// import com.mongodb.client.MongoClients;
// import com.walmart.product.ProductApplication;
import com.walmart.product.collection.Products;

// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.DisplayName;
// // import org.junit.jupiter.api.Test;

// import org.junit.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.junit.runner.RunWith;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
// import org.springframework.boot.test.context.SpringBootTest;
// import org.springframework.data.mongodb.core.MongoTemplate;
// import org.springframework.test.annotation.DirtiesContext;
// import org.springframework.test.context.ContextConfiguration;
// import org.springframework.test.context.junit.jupiter.SpringExtension;
// import org.springframework.test.context.junit4.SpringRunner;
// import org.springframework.util.SocketUtils;

// import de.flapdoodle.embed.mongo.MongodExecutable;
// import de.flapdoodle.embed.mongo.MongodStarter;
// import de.flapdoodle.embed.mongo.config.IMongodConfig;
// import de.flapdoodle.embed.mongo.config.MongodConfigBuilder;
// import de.flapdoodle.embed.mongo.config.Net;
// import de.flapdoodle.embed.mongo.distribution.Version;
// import de.flapdoodle.embed.process.runtime.Network;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import static com.walmart.product.helper.ProductServiceTestHelper.getDefaultProduct;

@RunWith(SpringRunner.class)
@SpringBootTest
@DirtiesContext
public class ProductsRepositoryTest {
    @Autowired
    ProductsRepository productsRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void givenUserObject_whenSave_thenCreateNewUser() {

        Products user = getDefaultProduct();
        productsRepository.save(user);

        assertThat(productsRepository.findAll().size()).isGreaterThan(0);
    }

    // private MongodExecutable mongodExecutable;
    // private MongoTemplate mongoTemplate;

    // @AfterEach
    // void clean() {
    //     mongodExecutable.stop();
    // }

    // @BeforeEach
    // void setup() throws Exception {
    //     String ip = "localhost";
    //     int randomPort = SocketUtils.findAvailableTcpPort();

    //     IMongodConfig mongodConfig = new MongodConfigBuilder().version(Version.Main.PRODUCTION)
    //         .net(new Net(ip, randomPort, Network.localhostIsIPv6()))
    //         .build();

    //     MongodStarter starter = MongodStarter.getDefaultInstance();
    //     mongodExecutable = starter.prepare(mongodConfig);
    //     mongodExecutable.start();
    //     mongoTemplate = new MongoTemplate(MongoClients.create("mongodb://" + ip + ":" + randomPort), "test");
    // }

    // @DisplayName("Given object When save object using MongoDB template Then object can be found")
    @Test
    void test() throws Exception {
        Products user = getDefaultProduct();
        productsRepository.save(user);

        assertThat(productsRepository.findAll().size()).isGreaterThan(0);

        // when
        // mongoTemplate.save(user, "products");

        // assertThat(mongoTemplate.findAll(DBObject.class, "products").size()).isGreaterThan(0);

        // then
        // assertThat(mongoTemplate.findAll(DBObject.class, "collection")).extracting("key")
        //     .containsOnly("value");
    }
}
