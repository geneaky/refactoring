package me.whiteship.refactoring._22_data_class._42_encapsulate_record;

import org.junit.jupiter.api.Test;

class OrganizationTest {

    @Test
    void name() throws Exception {
        Organization organization = new Organization("jcr", "korea");
        organization.name();
        organization.country();
    }
}