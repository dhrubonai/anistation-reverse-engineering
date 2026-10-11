.class public final Landroidx/lifecycle/r0;
.super Li7/h;
.source "SourceFile"

# interfaces
.implements Lh7/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/lifecycle/r0;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/lifecycle/r0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 p1, 0x0

    .line 6
    invoke-direct {p0, p1}, Li7/h;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/lifecycle/r0;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :pswitch_0
    invoke-virtual {p0}, Landroidx/lifecycle/r0;->b()Ljava/util/List;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :pswitch_1
    invoke-virtual {p0}, Landroidx/lifecycle/r0;->b()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :pswitch_2
    iget-object v0, p0, Landroidx/lifecycle/r0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Landroidx/lifecycle/c1;

    .line 20
    .line 21
    const-string v1, "<this>"

    .line 22
    .line 23
    invoke-static {v0, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Landroidx/lifecycle/a1;

    .line 27
    .line 28
    new-instance v2, Landroidx/fragment/app/v0;

    .line 29
    .line 30
    const/4 v3, 0x1

    .line 31
    invoke-direct {v2, v3}, Landroidx/fragment/app/v0;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {v1, v0, v2}, Landroidx/lifecycle/a1;-><init>(Landroidx/lifecycle/c1;Landroidx/lifecycle/y0;)V

    .line 35
    .line 36
    .line 37
    const-string v0, "androidx.lifecycle.internal.SavedStateHandlesVM"

    .line 38
    .line 39
    const-class v2, Landroidx/lifecycle/t0;

    .line 40
    .line 41
    invoke-virtual {v1, v2, v0}, Landroidx/lifecycle/a1;->b(Ljava/lang/Class;Ljava/lang/String;)Landroidx/lifecycle/w0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Landroidx/lifecycle/t0;

    .line 46
    .line 47
    return-object v0

    .line 48
    :goto_0
    invoke-virtual {p0}, Landroidx/lifecycle/r0;->b()Ljava/util/List;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    return-object v0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b()Ljava/util/List;
    .locals 4

    .line 1
    iget v0, p0, Landroidx/lifecycle/r0;->a:I

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/lifecycle/r0;->b:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    goto :goto_1

    .line 9
    :pswitch_0
    :try_start_0
    check-cast v1, Lh7/a;

    .line 10
    .line 11
    invoke-interface {v1}, Lh7/a;->a()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/List;
    :try_end_0
    .catch Ljavax/net/ssl/SSLPeerUnverifiedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    sget-object v0, Lx6/o;->a:Lx6/o;

    .line 19
    .line 20
    :goto_0
    return-object v0

    .line 21
    :pswitch_1
    check-cast v1, Ljava/util/List;

    .line 22
    .line 23
    return-object v1

    .line 24
    :goto_1
    check-cast v1, Lc9/k;

    .line 25
    .line 26
    iget-object v0, v1, Lc9/k;->e:Ly8/n;

    .line 27
    .line 28
    invoke-static {v0}, Lr6/h0;->q(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ly8/n;->a()Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    new-instance v1, Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-static {v0}, Lx6/j;->o0(Ljava/lang/Iterable;)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    check-cast v2, Ljava/security/cert/Certificate;

    .line 59
    .line 60
    const-string v3, "null cannot be cast to non-null type java.security.cert.X509Certificate"

    .line 61
    .line 62
    invoke-static {v2, v3}, Lr6/h0;->r(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    check-cast v2, Ljava/security/cert/X509Certificate;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_0
    return-object v1

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
