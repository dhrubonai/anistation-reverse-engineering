package o1;

import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import java.util.Map;
import java.util.UUID;
import k1.i0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class c0 implements y {

    /* renamed from: d, reason: collision with root package name */
    public static final k1.i f8109d = new k1.i();

    /* renamed from: a, reason: collision with root package name */
    public final UUID f8110a;

    /* renamed from: b, reason: collision with root package name */
    public final MediaDrm f8111b;

    /* renamed from: c, reason: collision with root package name */
    public int f8112c;

    public c0(UUID uuid) {
        uuid.getClass();
        UUID uuid2 = c1.j.f1724b;
        w7.b.f("Use C.CLEARKEY_UUID instead", !uuid2.equals(uuid));
        this.f8110a = uuid;
        MediaDrm mediaDrm = new MediaDrm((f1.b0.f3799a >= 27 || !c1.j.f1725c.equals(uuid)) ? uuid : uuid2);
        this.f8111b = mediaDrm;
        this.f8112c = 1;
        if (c1.j.f1726d.equals(uuid) && "ASUS_Z00AD".equals(f1.b0.f3802d)) {
            mediaDrm.setPropertyString("securityLevel", "L3");
        }
    }

    @Override // o1.y
    public final synchronized void a() {
        int i10 = this.f8112c - 1;
        this.f8112c = i10;
        if (i10 == 0) {
            this.f8111b.release();
        }
    }

    @Override // o1.y
    public final void b(byte[] bArr, byte[] bArr2) {
        this.f8111b.restoreKeys(bArr, bArr2);
    }

    @Override // o1.y
    public final Map c(byte[] bArr) {
        return this.f8111b.queryKeyStatus(bArr);
    }

    @Override // o1.y
    public final void d(byte[] bArr) {
        this.f8111b.closeSession(bArr);
    }

    @Override // o1.y
    public final byte[] e(byte[] bArr, byte[] bArr2) {
        if (c1.j.f1725c.equals(this.f8110a) && f1.b0.f3799a < 27) {
            try {
                JSONObject jSONObject = new JSONObject(f1.b0.n(bArr2));
                StringBuilder sb = new StringBuilder("{\"keys\":[");
                JSONArray jSONArray = jSONObject.getJSONArray("keys");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    if (i10 != 0) {
                        sb.append(",");
                    }
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    sb.append("{\"k\":\"");
                    sb.append(jSONObject2.getString("k").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kid\":\"");
                    sb.append(jSONObject2.getString("kid").replace('-', '+').replace('_', '/'));
                    sb.append("\",\"kty\":\"");
                    sb.append(jSONObject2.getString("kty"));
                    sb.append("\"}");
                }
                sb.append("]}");
                bArr2 = f1.b0.G(sb.toString());
            } catch (JSONException e10) {
                f1.o.d("ClearKeyUtil", "Failed to adjust response data: ".concat(f1.b0.n(bArr2)), e10);
            }
        }
        return this.f8111b.provideKeyResponse(bArr, bArr2);
    }

    @Override // o1.y
    public final x f() {
        MediaDrm.ProvisionRequest provisionRequest = this.f8111b.getProvisionRequest();
        return new x(provisionRequest.getDefaultUrl(), provisionRequest.getData());
    }

    @Override // o1.y
    public final void g(byte[] bArr) {
        this.f8111b.provideProvisionResponse(bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x01a9, code lost:
    
        if (r5 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a3, code lost:
    
        if ("AFTT".equals(r5) == false) goto L86;
     */
    @Override // o1.y
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o1.w h(byte[] r17, java.util.List r18, int r19, java.util.HashMap r20) {
        /*
            Method dump skipped, instructions count: 583
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o1.c0.h(byte[], java.util.List, int, java.util.HashMap):o1.w");
    }

    @Override // o1.y
    public final int i() {
        return 2;
    }

    @Override // o1.y
    public final void j(byte[] bArr, i0 i0Var) {
        if (f1.b0.f3799a >= 31) {
            try {
                b0.b(this.f8111b, bArr, i0Var);
            } catch (UnsupportedOperationException unused) {
                f1.o.f("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // o1.y
    public final i1.b k(byte[] bArr) {
        boolean z9;
        int i10 = f1.b0.f3799a;
        UUID uuid = this.f8110a;
        if (i10 < 21 && c1.j.f1726d.equals(uuid) && "L3".equals(this.f8111b.getPropertyString("securityLevel"))) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (i10 < 27 && c1.j.f1725c.equals(uuid)) {
            uuid = c1.j.f1724b;
        }
        return new z(uuid, bArr, z9);
    }

    @Override // o1.y
    public final boolean l(String str, byte[] bArr) {
        if (f1.b0.f3799a >= 31) {
            return b0.a(this.f8111b, str);
        }
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(this.f8110a, bArr);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(str);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    @Override // o1.y
    public final byte[] m() {
        return this.f8111b.openSession();
    }

    @Override // o1.y
    public final void n(final e eVar) {
        this.f8111b.setOnEventListener(new MediaDrm.OnEventListener() { // from class: o1.a0
            @Override // android.media.MediaDrm.OnEventListener
            public final void onEvent(MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
                c0 c0Var = c0.this;
                e eVar2 = eVar;
                c0Var.getClass();
                f fVar = eVar2.f8141a.O;
                fVar.getClass();
                fVar.obtainMessage(i10, bArr).sendToTarget();
            }
        });
    }
}
