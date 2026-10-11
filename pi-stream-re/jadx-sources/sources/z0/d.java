package z0;

import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.u;
import i4.v;
import java.io.PrintWriter;
import n.l;

/* loaded from: classes.dex */
public final class d extends a {

    /* renamed from: a, reason: collision with root package name */
    public final u f11886a;

    /* renamed from: b, reason: collision with root package name */
    public final c f11887b;

    public d(u uVar, b1 b1Var) {
        this.f11886a = uVar;
        this.f11887b = (c) new a1(b1Var, c.f11883c).a(c.class);
    }

    public final void b(String str, PrintWriter printWriter) {
        boolean z9;
        c cVar = this.f11887b;
        if (cVar.f11884a.f7895c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i10 = 0;
            while (true) {
                l lVar = cVar.f11884a;
                if (i10 < lVar.f7895c) {
                    b bVar = (b) lVar.f7894b[i10];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(cVar.f11884a.f7893a[i10]);
                    printWriter.print(": ");
                    printWriter.println(bVar.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(bVar.f11878l);
                    printWriter.print(" mArgs=");
                    printWriter.println(bVar.f11879m);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(bVar.f11880n);
                    a1.b bVar2 = bVar.f11880n;
                    String str3 = str2 + "  ";
                    bVar2.getClass();
                    printWriter.print(str3);
                    printWriter.print("mId=");
                    printWriter.print(bVar2.f17a);
                    printWriter.print(" mListener=");
                    printWriter.println(bVar2.f18b);
                    if (bVar2.f19c || bVar2.f22f) {
                        printWriter.print(str3);
                        printWriter.print("mStarted=");
                        printWriter.print(bVar2.f19c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(bVar2.f22f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (bVar2.f20d || bVar2.f21e) {
                        printWriter.print(str3);
                        printWriter.print("mAbandoned=");
                        printWriter.print(bVar2.f20d);
                        printWriter.print(" mReset=");
                        printWriter.println(bVar2.f21e);
                    }
                    if (bVar2.f24h != null) {
                        printWriter.print(str3);
                        printWriter.print("mTask=");
                        printWriter.print(bVar2.f24h);
                        printWriter.print(" waiting=");
                        bVar2.f24h.getClass();
                        printWriter.println(false);
                    }
                    if (bVar2.f25i != null) {
                        printWriter.print(str3);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(bVar2.f25i);
                        printWriter.print(" waiting=");
                        bVar2.f25i.getClass();
                        printWriter.println(false);
                    }
                    if (bVar.f11881p != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(bVar.f11881p);
                        v vVar = bVar.f11881p;
                        vVar.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(vVar.f5380b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    a1.b bVar3 = bVar.f11880n;
                    Object d10 = bVar.d();
                    bVar3.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    w7.b.e(d10, sb);
                    sb.append("}");
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    if (bVar.f1081c > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    printWriter.println(z9);
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        w7.b.e(this.f11886a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
