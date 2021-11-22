import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddressComponent } from './address/address.component';
import { BillingComponent } from './billing/billing.component';
import { CustomerComponent } from './customer/customer.component';
import { OrderComponent } from './order/order.component';
import { ProductComponent } from './product/product.component';

const routes: Routes = [

{path:'product',component:ProductComponent},
{path:'order',component:OrderComponent},
{path:'bill',component:BillingComponent},
{path:'address',component:AddressComponent},
{path:'customer',component:CustomerComponent},
{path:'',redirectTo:'/product',pathMatch:'full'}  //redirect to landing page
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }