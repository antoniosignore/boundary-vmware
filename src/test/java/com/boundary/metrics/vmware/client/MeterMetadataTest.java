// Copyright 2014 Boundary, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.boundary.metrics.vmware.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.boundary.metrics.vmware.client.client.meter.manager.MeterMetadata;

public class MeterMetadataTest {

	MeterMetadata meterMetadata;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		meterMetadata = new MeterMetadata();
	}

	@After
	public void tearDown() throws Exception {
		meterMetadata = null;
	}

	@Test
	public void testNull() {
		assertNotNull(meterMetadata);
	}

	@Test
	public void testGetId() {
		assertNull(meterMetadata.getId());
	}

	@Test
	public void testGetName() {
		assertNull(meterMetadata.getName());
	}

	@Test
	public void testGetObservationDomainId() {
		assertNull(meterMetadata.getName());
	}

	@Test
	public void testGetOrgId() {
		assertNull(meterMetadata.getOrgId());
	}
}
