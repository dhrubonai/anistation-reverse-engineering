.class public final Landroidx/fragment/app/v0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/y0;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Landroidx/fragment/app/v0;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Class;)Landroidx/lifecycle/w0;
    .locals 1

    iget v0, p0, Landroidx/fragment/app/v0;->a:I

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    const-string v0, "modelClass"

    .line 1
    invoke-static {p1, v0}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 3
    :pswitch_1
    new-instance p1, Landroidx/fragment/app/w0;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Landroidx/fragment/app/w0;-><init>(Z)V

    return-object p1

    .line 4
    :goto_0
    new-instance p1, Lz0/c;

    invoke-direct {p1}, Lz0/c;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final create(Ljava/lang/Class;Ly0/c;)Landroidx/lifecycle/w0;
    .locals 3

    iget v0, p0, Landroidx/fragment/app/v0;->a:I

    const-string v1, "extras"

    const-string v2, "modelClass"

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 5
    :pswitch_0
    invoke-static {p1, v2}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    new-instance p1, Landroidx/lifecycle/t0;

    invoke-direct {p1}, Landroidx/lifecycle/t0;-><init>()V

    return-object p1

    .line 7
    :pswitch_1
    invoke-static {p1, v2}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    invoke-virtual {p0, p1}, Landroidx/fragment/app/v0;->create(Ljava/lang/Class;)Landroidx/lifecycle/w0;

    move-result-object p1

    return-object p1

    .line 9
    :goto_0
    invoke-static {p1, v2}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v1}, Lr6/h0;->u(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0, p1}, Landroidx/fragment/app/v0;->create(Ljava/lang/Class;)Landroidx/lifecycle/w0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
