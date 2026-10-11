package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uw5 implements y16 {
    public static final Pattern D = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public LinkedHashMap A;
    public final boolean x;
    public final lq1 y;
    public float B = -3.4028235E38f;
    public float C = -3.4028235E38f;
    public final zi4 z = new zi4();

    public uw5(List list) {
        if (list != null && !list.isEmpty()) {
            this.x = true;
            byte[] bArr = (byte[]) list.get(0);
            Charset charset = StandardCharsets.UTF_8;
            String str = new String(bArr, charset);
            io3.n(str.startsWith("Format:"));
            lq1 a = lq1.a(str);
            a.getClass();
            this.y = a;
            b(new zi4((byte[]) list.get(1)), charset);
            return;
        }
        this.x = false;
        this.y = null;
    }

    public static int a(long j, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            } else {
                i = 0;
                break;
            }
        }
        arrayList.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i - 1));
        }
        arrayList2.add(i, arrayList3);
        return i;
    }

    public static long c(String str) {
        Matcher matcher = D.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = eq6.a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0280, code lost:
    
        if (r8 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0284, code lost:
    
        if (r22 == (-3.4028235E38f)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0288, code lost:
    
        if (r19 == (-3.4028235E38f)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x028a, code lost:
    
        r27 = r8.x / r19;
        r24 = r8.y / r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x02c5, code lost:
    
        r19 = new defpackage.b31(r11, r21, null, null, r24, r3, r1, r27, r9, r29, r30, -3.4028235E38f, -3.4028235E38f, false, com.anistation.model.settings.SubtitleArgbColor.BLACK, Integer.MIN_VALUE, 0.0f, r37);
        r1 = a(r13, r7, r6);
        r3 = a(r4, r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x02e8, code lost:
    
        if (r1 >= r3) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02ea, code lost:
    
        ((java.util.List) r6.get(r1)).add(r19);
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0297, code lost:
    
        r10 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x029f, code lost:
    
        if (r9 == 0) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x02a1, code lost:
    
        r12 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02a2, code lost:
    
        if (r9 == 1) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x02a4, code lost:
    
        r15 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02a5, code lost:
    
        if (r9 == 2) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x02a7, code lost:
    
        r16 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x02b5, code lost:
    
        if (r1 == 0) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x02b7, code lost:
    
        if (r1 == r12) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02b9, code lost:
    
        if (r1 == r15) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02bb, code lost:
    
        r10 = -3.4028235E38f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x02c1, code lost:
    
        r24 = r10;
        r27 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02be, code lost:
    
        r10 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02c0, code lost:
    
        r10 = 0.05f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x02aa, code lost:
    
        r16 = 0.95f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02ad, code lost:
    
        r15 = 2;
        r16 = 0.5f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02b1, code lost:
    
        r12 = 1;
        r15 = 2;
        r16 = 0.05f;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cc  */
    @Override // defpackage.y16
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E(byte[] r44, int r45, int r46, defpackage.x16 r47, defpackage.ay0 r48) {
        /*
            Method dump skipped, instructions count: 996
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw5.E(byte[], int, int, x16, ay0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:185:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.zi4 r39, java.nio.charset.Charset r40) {
        /*
            Method dump skipped, instructions count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw5.b(zi4, java.nio.charset.Charset):void");
    }
}
