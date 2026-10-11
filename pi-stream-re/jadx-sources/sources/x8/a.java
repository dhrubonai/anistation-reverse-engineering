package x8;

import androidx.lifecycle.c0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import msr.pistream.app.viewmodel.AuthViewModel;

/* loaded from: classes.dex */
public final /* synthetic */ class a implements OnCompleteListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AuthViewModel f11394b;

    public /* synthetic */ a(AuthViewModel authViewModel, int i10) {
        this.f11393a = i10;
        this.f11394b = authViewModel;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int i10 = this.f11393a;
        AuthViewModel authViewModel = this.f11394b;
        switch (i10) {
            case 0:
                authViewModel.getClass();
                boolean isSuccessful = task.isSuccessful();
                c0 c0Var = authViewModel.f7782d;
                if (isSuccessful) {
                    c0Var.j(b8.a.d(null));
                    authViewModel.f7781c.j(Boolean.TRUE);
                    return;
                } else {
                    c0Var.j(b8.a.a(e8.b.a(task.getException())));
                    return;
                }
            case 1:
                authViewModel.getClass();
                boolean isSuccessful2 = task.isSuccessful();
                c0 c0Var2 = authViewModel.f7782d;
                if (isSuccessful2) {
                    c0Var2.j(b8.a.d(null));
                    authViewModel.f7781c.j(Boolean.TRUE);
                    return;
                } else {
                    c0Var2.j(b8.a.a(e8.b.a(task.getException())));
                    return;
                }
            case 2:
                authViewModel.getClass();
                boolean isSuccessful3 = task.isSuccessful();
                c0 c0Var3 = authViewModel.f7782d;
                if (isSuccessful3) {
                    c0Var3.j(b8.a.d("Password reset email sent. Check your inbox."));
                    return;
                } else {
                    c0Var3.j(b8.a.a(e8.b.a(task.getException())));
                    return;
                }
            default:
                authViewModel.getClass();
                boolean isSuccessful4 = task.isSuccessful();
                c0 c0Var4 = authViewModel.f7782d;
                if (isSuccessful4) {
                    c0Var4.j(b8.a.d(null));
                    authViewModel.f7781c.j(Boolean.TRUE);
                    return;
                } else {
                    c0Var4.j(b8.a.a(e8.b.a(task.getException())));
                    return;
                }
        }
    }
}
