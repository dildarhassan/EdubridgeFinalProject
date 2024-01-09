import { TestBed } from '@angular/core/testing';

import { PatientDetailsServiceService } from './Services/patient-details-service.service';

describe('PatientDetailsServiceService', () => {
  let service: PatientDetailsServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientDetailsServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
