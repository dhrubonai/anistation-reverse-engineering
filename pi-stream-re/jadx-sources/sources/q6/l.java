package q6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final a f9222a;

    /* renamed from: b, reason: collision with root package name */
    public final k3.d f9223b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9224c;

    public l(k3.d dVar) {
        d dVar2 = d.f9204b;
        this.f9223b = dVar;
        this.f9222a = dVar2;
        this.f9224c = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }

    public final List a(CharSequence charSequence) {
        charSequence.getClass();
        k3.d dVar = this.f9223b;
        dVar.getClass();
        j jVar = new j(dVar, this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (jVar.hasNext()) {
            arrayList.add((String) jVar.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
