import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { MynotemakerSharedModule } from '../../shared';
import {
    NoteService,
    NotePopupService,
    NoteComponent,
    NoteDetailComponent,
    NoteDialogComponent,
    NotePopupComponent,
    NoteDeletePopupComponent,
    NoteDeleteDialogComponent,
    noteRoute,
    notePopupRoute,
} from './';

const ENTITY_STATES = [
    ...noteRoute,
    ...notePopupRoute,
];

@NgModule({
    imports: [
        MynotemakerSharedModule,
        RouterModule.forRoot(ENTITY_STATES, { useHash: true })
    ],
    declarations: [
        NoteComponent,
        NoteDetailComponent,
        NoteDialogComponent,
        NoteDeleteDialogComponent,
        NotePopupComponent,
        NoteDeletePopupComponent,
    ],
    entryComponents: [
        NoteComponent,
        NoteDialogComponent,
        NotePopupComponent,
        NoteDeleteDialogComponent,
        NoteDeletePopupComponent,
    ],
    providers: [
        NoteService,
        NotePopupService,
    ],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class MynotemakerNoteModule {}
