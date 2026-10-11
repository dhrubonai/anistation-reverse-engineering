package a5;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.o;
import com.google.android.gms.common.api.s;
import com.google.android.gms.internal.p000authapi.zbc;

/* loaded from: classes.dex */
public final class h extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(o oVar, int i10) {
        super(oVar);
        this.f106a = i10;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ s createFailedResult(Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.d
    public final void doExecute(com.google.android.gms.common.api.b bVar) {
        switch (this.f106a) {
            case 0:
                f fVar = (f) bVar;
                l lVar = (l) fVar.getService();
                g gVar = new g(this, 0);
                Parcel zba = lVar.zba();
                zbc.zbd(zba, gVar);
                zbc.zbc(zba, fVar.f103a);
                lVar.zbb(102, zba);
                return;
            default:
                f fVar2 = (f) bVar;
                l lVar2 = (l) fVar2.getService();
                g gVar2 = new g(this, 1);
                Parcel zba2 = lVar2.zba();
                zbc.zbd(zba2, gVar2);
                zbc.zbc(zba2, fVar2.f103a);
                lVar2.zbb(103, zba2);
                return;
        }
    }
}
