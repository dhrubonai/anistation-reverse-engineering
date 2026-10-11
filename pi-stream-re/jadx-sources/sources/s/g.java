package s;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f9644a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f9645b = new SparseArray();

    public g(Context context, int i10) {
        char c6;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            c.j jVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        String name = xml.getName();
                        switch (name.hashCode()) {
                            case -1349929691:
                                if (name.equals("ConstraintSet")) {
                                    c6 = 4;
                                    break;
                                }
                                break;
                            case 80204913:
                                if (name.equals("State")) {
                                    c6 = 2;
                                    break;
                                }
                                break;
                            case 1382829617:
                                if (name.equals("StateSet")) {
                                    c6 = 1;
                                    break;
                                }
                                break;
                            case 1657696882:
                                if (name.equals("layoutDescription")) {
                                    c6 = 0;
                                    break;
                                }
                                break;
                            case 1901439077:
                                if (name.equals("Variant")) {
                                    c6 = 3;
                                    break;
                                }
                                break;
                        }
                        c6 = 65535;
                        if (c6 != 0 && c6 != 1) {
                            if (c6 != 2) {
                                if (c6 != 3) {
                                    if (c6 != 4) {
                                        Log.v("ConstraintLayoutStates", "unknown tag " + name);
                                    } else {
                                        a(context, xml);
                                    }
                                } else {
                                    f fVar = new f(context, xml);
                                    if (jVar != null) {
                                        ((ArrayList) jVar.f1596c).add(fVar);
                                    }
                                }
                            } else {
                                c.j jVar2 = new c.j(context, xml);
                                this.f9644a.put(jVar2.f1594a, jVar2);
                                jVar = jVar2;
                            }
                        }
                    }
                } else {
                    xml.getName();
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x01ce, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:42:0x00ea. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r13, android.content.res.XmlResourceParser r14) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s.g.a(android.content.Context, android.content.res.XmlResourceParser):void");
    }
}
