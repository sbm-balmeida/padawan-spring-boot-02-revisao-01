import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookComponent } from './book/book.component';

const routes: Routes = [
  { 
    path: 'api/books', 
    component: BookComponent 
  },
  { 
    path: '', 
    redirectTo: 'api/books', 
    pathMatch: 'full' 
  },
  { 
    path: '**', 
    redirectTo: 'api/books' 
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
