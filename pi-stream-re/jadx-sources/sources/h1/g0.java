package h1;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class g0 extends c {

    /* renamed from: e, reason: collision with root package name */
    public final int f4573e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f4574f;

    /* renamed from: g, reason: collision with root package name */
    public final DatagramPacket f4575g;

    /* renamed from: h, reason: collision with root package name */
    public Uri f4576h;

    /* renamed from: i, reason: collision with root package name */
    public DatagramSocket f4577i;

    /* renamed from: j, reason: collision with root package name */
    public MulticastSocket f4578j;

    /* renamed from: k, reason: collision with root package name */
    public InetAddress f4579k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f4580l;

    /* renamed from: m, reason: collision with root package name */
    public int f4581m;

    public g0() {
        super(true);
        this.f4573e = 8000;
        byte[] bArr = new byte[2000];
        this.f4574f = bArr;
        this.f4575g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // h1.h
    public final void close() {
        this.f4576h = null;
        MulticastSocket multicastSocket = this.f4578j;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f4579k;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f4578j = null;
        }
        DatagramSocket datagramSocket = this.f4577i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f4577i = null;
        }
        this.f4579k = null;
        this.f4581m = 0;
        if (this.f4580l) {
            this.f4580l = false;
            s();
        }
    }

    @Override // h1.h
    public final Uri j() {
        return this.f4576h;
    }

    @Override // h1.h
    public final long m(l lVar) {
        Uri uri = lVar.f4597a;
        this.f4576h = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f4576h.getPort();
        t();
        try {
            this.f4579k = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f4579k, port);
            if (this.f4579k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f4578j = multicastSocket;
                multicastSocket.joinGroup(this.f4579k);
                this.f4577i = this.f4578j;
            } else {
                this.f4577i = new DatagramSocket(inetSocketAddress);
            }
            this.f4577i.setSoTimeout(this.f4573e);
            this.f4580l = true;
            u(lVar);
            return -1L;
        } catch (IOException e10) {
            throw new f0(2001, e10);
        } catch (SecurityException e11) {
            throw new f0(2006, e11);
        }
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f4581m;
        DatagramPacket datagramPacket = this.f4575g;
        if (i12 == 0) {
            try {
                DatagramSocket datagramSocket = this.f4577i;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f4581m = length;
                r(length);
            } catch (SocketTimeoutException e10) {
                throw new f0(2002, e10);
            } catch (IOException e11) {
                throw new f0(2001, e11);
            }
        }
        int length2 = datagramPacket.getLength();
        int i13 = this.f4581m;
        int min = Math.min(i13, i11);
        System.arraycopy(this.f4574f, length2 - i13, bArr, i10, min);
        this.f4581m -= min;
        return min;
    }
}
