package defpackage;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ej2 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ HandleInvocationsFromAdViewer y;
    public final /* synthetic */ AdObject z;

    public /* synthetic */ ej2(AdObject adObject, HandleInvocationsFromAdViewer handleInvocationsFromAdViewer) {
        this.x = (byte) 18;
        this.z = adObject;
        this.y = handleInvocationsFromAdViewer;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        HandleInvocationsFromAdViewer handleInvocationsFromAdViewer = this.y;
        AdObject adObject = this.z;
        switch (b) {
            case 0:
                return HandleInvocationsFromAdViewer.k(adObject, handleInvocationsFromAdViewer);
            case 1:
                return HandleInvocationsFromAdViewer.b0(adObject, handleInvocationsFromAdViewer);
            case 2:
                return HandleInvocationsFromAdViewer.q(adObject, handleInvocationsFromAdViewer);
            case 3:
                return HandleInvocationsFromAdViewer.f(adObject, handleInvocationsFromAdViewer);
            case 4:
                return HandleInvocationsFromAdViewer.l(adObject, handleInvocationsFromAdViewer);
            case 5:
                return HandleInvocationsFromAdViewer.t(adObject, handleInvocationsFromAdViewer);
            case 6:
                return HandleInvocationsFromAdViewer.d(adObject, handleInvocationsFromAdViewer);
            case 7:
                return HandleInvocationsFromAdViewer.i(adObject, handleInvocationsFromAdViewer);
            case 8:
                return HandleInvocationsFromAdViewer.Z(adObject, handleInvocationsFromAdViewer);
            case 9:
                return HandleInvocationsFromAdViewer.n(adObject, handleInvocationsFromAdViewer);
            case 10:
                return HandleInvocationsFromAdViewer.U(adObject, handleInvocationsFromAdViewer);
            case 11:
                return HandleInvocationsFromAdViewer.u(adObject, handleInvocationsFromAdViewer);
            case 12:
                return HandleInvocationsFromAdViewer.X(adObject, handleInvocationsFromAdViewer);
            case 13:
                return HandleInvocationsFromAdViewer.K(adObject, handleInvocationsFromAdViewer);
            case 14:
                return HandleInvocationsFromAdViewer.a(adObject, handleInvocationsFromAdViewer);
            case 15:
                return HandleInvocationsFromAdViewer.c(adObject, handleInvocationsFromAdViewer);
            case 16:
                return HandleInvocationsFromAdViewer.F(adObject, handleInvocationsFromAdViewer);
            case 17:
                return HandleInvocationsFromAdViewer.W(adObject, handleInvocationsFromAdViewer);
            default:
                return HandleInvocationsFromAdViewer.Y(adObject, handleInvocationsFromAdViewer);
        }
    }

    public /* synthetic */ ej2(HandleInvocationsFromAdViewer handleInvocationsFromAdViewer, AdObject adObject, byte b) {
        this.x = b;
        this.y = handleInvocationsFromAdViewer;
        this.z = adObject;
    }
}
