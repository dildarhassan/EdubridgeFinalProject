
import { Component, OnInit } from '@angular/core';
import { NgbCarouselConfig } from '@ng-bootstrap/ng-bootstrap';
import { CarouselService } from '../Services/carousel.service';


@Component({
  selector: 'app-carousel',
  templateUrl: './carousal.component.html',
  styleUrls: ['./carousal.component.css'],
  providers: [NgbCarouselConfig]
})
export class CarouselComponent implements OnInit {
  carouselItems: any[] = [
    {
      imageUrl: 'assets/istockphoto-1182474473-1024x1024.jpg',
      title: 'House Cleaning',
      description: 'Professional cleaning services for your home.',
    },
    {
      imageUrl: 'assets/ca.jpg',
      title: 'House Cleaning',
      description: 'Professional cleaning services for your home.',
    },

    {
      imageUrl: 'assets/house-cleaning.jpg',
      title: 'House Cleaning',
      description: 'Professional cleaning services for your home.',
    }
    // Add more items as needed
  ];

  constructor(private carousalService: CarouselService, config: NgbCarouselConfig) {
    config.interval = 3000;
  }

  ngOnInit(): void {
    this.carousalService.getCarouselData().subscribe((data: any[]) => {
      this.carouselItems = data;
    });
  }
}
