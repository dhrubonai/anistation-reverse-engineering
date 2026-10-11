package k1;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import c1.p1;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.UserProfileChangeRequest;
import java.util.ArrayList;
import java.util.List;
import msr.pistream.app.ui.home.screens.MainActivity;

/* loaded from: classes.dex */
public final /* synthetic */ class x implements f1.l, f1.m, y1.m, Continuation, androidx.lifecycle.d0, OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6403a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6404b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6405c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.f6403a = i10;
        this.f6404b = obj;
        this.f6405c = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    @Override // y1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r6.n1 a(int r21, c1.f1 r22, int[] r23) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.x.a(int, c1.f1, int[]):r6.n1");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0574  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0561  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0522  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0529  */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.lang.Object, c1.v] */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v29 */
    @Override // f1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.Object r25, c1.s r26) {
        /*
            Method dump skipped, instructions count: 1568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.x.b(java.lang.Object, c1.s):void");
    }

    public final void c(com.google.android.gms.common.api.internal.i0 i0Var) {
        MainActivity mainActivity = (MainActivity) this.f6404b;
        c8.c cVar = (c8.c) this.f6405c;
        int i10 = MainActivity.f7741b0;
        mainActivity.getClass();
        i0Var.c(true);
        i0Var.d("Downloading… 0%");
        z7.a.f12081a.execute(new q0.o(cVar, new z3.e(mainActivity, i0Var, 21), mainActivity, 8));
    }

    @Override // androidx.lifecycle.d0
    public final void f(Object obj) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        l8.n nVar = (l8.n) this.f6404b;
        LinearLayout linearLayout = (LinearLayout) this.f6405c;
        List list = (List) obj;
        ArrayList arrayList = nVar.B0;
        arrayList.clear();
        arrayList.addAll(list);
        nVar.A0.e(new ArrayList(list));
        int max = Math.max(1, (arrayList.size() + 1) / 2);
        if (nVar.f6975v0) {
            i10 = 250;
        } else {
            i10 = 268;
        }
        if ((nVar.d() instanceof MainActivity) && ((MainActivity) nVar.d()).J != null && ((MainActivity) nVar.d()).J.getVisibility() == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            i11 = 0;
        } else {
            i11 = 130;
        }
        if (z9) {
            i12 = 0;
        } else {
            i12 = 16;
        }
        int U = nVar.U((max * i10) + i11 + i12);
        ViewGroup.LayoutParams layoutParams = nVar.f6977x0.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, U);
        } else {
            layoutParams.height = U;
        }
        nVar.f6977x0.setLayoutParams(layoutParams);
        if (!list.isEmpty()) {
            nVar.Y();
            nVar.f6977x0.setVisibility(0);
            nVar.C0 = true;
            linearLayout.post(new l8.i(nVar, 1));
        }
    }

    @Override // f1.l
    public final void invoke(Object obj) {
        switch (this.f6403a) {
            case 0:
                ((c) obj).getClass();
                return;
            case 1:
                ((c) obj).getClass();
                return;
            case 2:
                ((c) obj).getClass();
                return;
            case 3:
                ((c) obj).getClass();
                return;
            case 4:
            default:
                ((c) obj).getClass();
                return;
            case 5:
                ((c) obj).getClass();
                return;
            case 6:
                ((c) obj).getClass();
                return;
            case zzaja.zze.zzg /* 7 */:
                ((c) obj).getClass();
                return;
            case 8:
                ((c) obj).getClass();
                return;
            case 9:
                p1 p1Var = (p1) this.f6405c;
                f0 f0Var = (f0) ((c) obj);
                y.c cVar = f0Var.o;
                if (cVar != null) {
                    c1.v vVar = (c1.v) cVar.f11424b;
                    if (vVar.f1940s == -1) {
                        c1.u uVar = new c1.u(vVar);
                        uVar.f1912q = p1Var.f1879a;
                        uVar.f1913r = p1Var.f1880b;
                        f0Var.o = new y.c(new c1.v(uVar), cVar.f11423a, (String) cVar.f11425c);
                    }
                }
                int i10 = p1Var.f1879a;
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        String str;
        String str2;
        int i10 = this.f6403a;
        Object obj = this.f6405c;
        Object obj2 = this.f6404b;
        switch (i10) {
            case 16:
                l8.z zVar = (l8.z) obj2;
                String str3 = (String) obj;
                if (task.isSuccessful()) {
                    zVar.m("Password reset email sent to " + str3);
                    return;
                } else {
                    if (task.getException() != null) {
                        str2 = task.getException().getLocalizedMessage();
                    } else {
                        str2 = "Failed to send reset email";
                    }
                    zVar.m(str2);
                    return;
                }
            default:
                TextView textView = (TextView) obj2;
                l8.z zVar2 = (l8.z) obj;
                textView.setEnabled(true);
                textView.setText("Update");
                if (task.isSuccessful()) {
                    zVar2.m("Profile updated");
                    zVar2.k();
                    return;
                } else {
                    if (task.getException() != null) {
                        str = task.getException().getLocalizedMessage();
                    } else {
                        str = "Update failed";
                    }
                    zVar2.m(str);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        e8.b bVar = (e8.b) this.f6404b;
        String str = (String) this.f6405c;
        bVar.getClass();
        if (task.isSuccessful()) {
            FirebaseAuth firebaseAuth = bVar.f3595a;
            if (firebaseAuth.getCurrentUser() != null) {
                return firebaseAuth.getCurrentUser().updateProfile(new UserProfileChangeRequest.Builder().setDisplayName(str).build()).continueWith(new w.f(task, 21));
            }
            return task;
        }
        return task;
    }
}
