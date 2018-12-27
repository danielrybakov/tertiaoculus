import { Moment } from 'moment';

export interface IPost {
  id?: number;
  imageUrl?: string;
  country?: string;
  city?: string;
  date?: Moment;
}

export const defaultValue: Readonly<IPost> = {};
