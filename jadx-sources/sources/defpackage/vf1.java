package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vf1 extends RuntimeException {
    public final pt0 x;

    public vf1(pt0 pt0Var) {
        this.x = pt0Var;
        if (!pt0Var.b) {
            int[] iArr = {201, 202, 204, 206, 207, 125, -127, 126665345, 200};
            List list = pt0Var.a;
            int size = list.size();
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                rt0 rt0Var = (rt0) list.get(i);
                if (!ms.r0(iArr, rt0Var.a)) {
                    if (rt0Var.a == 100) {
                        int i3 = i + 2;
                        if (i3 < size && ((rt0) list.get(i3)).a == 1000) {
                            break;
                        } else {
                            dp0.c0(arrayList);
                        }
                    } else {
                        arrayList.add(rt0Var);
                    }
                }
                i = i2;
            }
            int size2 = arrayList.size();
            StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
            for (int i4 = 0; i4 < size2; i4++) {
                stackTraceElementArr[i4] = new StackTraceElement("$$compose", qx1.h(((rt0) arrayList.get(i4)).a, "m$"), "SourceFile", 1);
            }
            setStackTrace(stackTraceElementArr);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        pt0 pt0Var = this.x;
        if (pt0Var.b) {
            StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
            ai3 y = te4.y();
            List list = pt0Var.a;
            list.getClass();
            bo3 bo3Var = new bo3(list);
            int b = bo3Var.b();
            for (int i = 0; i < b; i++) {
                ((rt0) bo3Var.get(i)).getClass();
            }
            ai3 r = te4.r(y);
            r.getClass();
            bo3 bo3Var2 = new bo3(r);
            int b2 = bo3Var2.b();
            for (int i2 = 0; i2 < b2; i2++) {
                String str = (String) bo3Var2.get(i2);
                sb.append("\tat ");
                sb.append(str);
                sb.append('\n');
            }
            return sb.toString();
        }
        return "Composition stack when thrown:";
    }
}
