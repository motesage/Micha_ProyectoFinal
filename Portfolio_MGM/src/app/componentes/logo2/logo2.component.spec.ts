import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Logo2Component } from './logo2.component';

describe('Logo2Component', () => {
  let component: Logo2Component;
  let fixture: ComponentFixture<Logo2Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ Logo2Component ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Logo2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
