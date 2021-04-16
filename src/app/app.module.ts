import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { HealthcaresComponent } from './healthcares/healthcares.component';
import { HealthcareSearchComponent } from './healthcare-search/healthcare-search.component';

@NgModule({
  declarations: [
    AppComponent,
    HealthcaresComponent,
    HealthcareSearchComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
