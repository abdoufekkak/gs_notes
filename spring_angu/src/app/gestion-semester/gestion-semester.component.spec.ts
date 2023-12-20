import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GestionSemesterComponent } from './gestion-semester.component';

describe('GestionSemesterComponent', () => {
  let component: GestionSemesterComponent;
  let fixture: ComponentFixture<GestionSemesterComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [GestionSemesterComponent],
    });
    fixture = TestBed.createComponent(GestionSemesterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
