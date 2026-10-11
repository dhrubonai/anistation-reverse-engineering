package dagger.hilt.android.lifecycle;

import dagger.hilt.android.internal.lifecycle.HiltViewModelFactory;
import h7.l;
import r6.h0;
import y0.b;
import y0.c;
import y0.d;

/* loaded from: classes.dex */
public final class HiltViewModelExtensions {
    public static final <VMF> c addCreationCallback(d dVar, l lVar) {
        h0.u(dVar, "<this>");
        h0.u(lVar, "callback");
        b bVar = HiltViewModelFactory.CREATION_CALLBACK_KEY;
        h0.s(bVar, "CREATION_CALLBACK_KEY");
        dVar.b(bVar, new HiltViewModelExtensions$addCreationCallback$1$1(lVar));
        return dVar;
    }

    public static final <VMF> c withCreationCallback(c cVar, l lVar) {
        h0.u(cVar, "<this>");
        h0.u(lVar, "callback");
        return addCreationCallback(new d(cVar), lVar);
    }
}
