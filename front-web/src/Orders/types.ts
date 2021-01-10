import { type } from "os";

export type Product = {

id: number;
name: string;
price: number;
description: string;
imageUri: string;

}

export type OrderLocationData = {
    latitude: number;
    longitude: number;
    address: string;
}

type ProductId = {
    id:number;
}
// Vai enviar para o backend a lista de produtos, lat, long e address
export type OrderPayload = {
    products: ProductId[];

} & OrderLocationData