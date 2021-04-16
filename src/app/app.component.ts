import { Component } from "@angular/core";
import { HttpClient } from "@angular/common/http";

@Component({
    selector: "app-root",
    templateUrl: "./app.component.html",
    styleUrls: ["./app.component.css"],
})
export class AppComponent {
    title = "HealthPointApp";
    stepData = {};
    healthcares = HEALTHCARES;
    selectedHealthcare: Healthcare;

    constructor(private http: HttpClient) {
        http.get("home").subscribe((stepData) => (this.stepData = stepData));
    }
    ngOnInit() {
  }

  onSelect(healthcare: Healthcare): void {
    this.selectedHealthcare = healthcare;
  }
}
