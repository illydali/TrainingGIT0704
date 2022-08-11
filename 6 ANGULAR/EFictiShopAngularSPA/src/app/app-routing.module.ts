import { NgModule } from "@angular/core";
import { RouterModule, Routes } from "@angular/router";
import { AddEmpSbComponent } from "./add-emp-sb/add-emp-sb.component";
import { AddEmpComponent } from "./add-emp/add-emp.component";
import { ListEmpSbComponent } from "./list-emp-sb/list-emp-sb.component";
import { ListEmpComponent } from "./list-emp/list-emp.component";
import { UpdateEmpSbComponent } from "./update-emp-sb/update-emp-sb.component";
import { UpdateEmpComponent } from "./update-emp/update-emp.component";


const routes: Routes = [
    // localhost:4200 (localhost:4200/employees)
    {path : '', redirectTo: 'employees-sb', pathMatch: 'full'},
    // employees = load ListEmpComponent
    {path: 'employees', component:ListEmpComponent},
    {path: 'employees-sb', component:ListEmpSbComponent},
    {path: 'add', component:AddEmpComponent},
    {path: 'add-sb', component:AddEmpSbComponent},
    {path: 'update/:id', component:UpdateEmpComponent},
    {path: 'update-sb/:id', component:UpdateEmpSbComponent}
]

@NgModule({
    //AppRoutingModule is using the RouterModule
    //import it / configure it
    imports: [RouterModule.forRoot(routes)],
    // export RouterModule / used by other modules / outside AppRoutingModule
    exports: [RouterModule]
})
export class AppRoutingModule {}