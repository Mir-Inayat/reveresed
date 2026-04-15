package w1;

import android.content.Intent;
import android.net.VpnService;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import com.redhand.laugh.MainActivity;

/* JADX INFO: compiled from: r8-map-id-5e0cc0aaff46ca9cdb8bb83aa49788d6127e7de84820c545817263cb4316462a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2509b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f2508a = i2;
        this.f2509b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2508a) {
            case 0:
                e eVar = (e) this.f2509b;
                EditText editText = eVar.f2520i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.p();
                    break;
                }
                break;
            case 1:
                ((l) this.f2509b).t();
                break;
            case 2:
                t tVar = (t) this.f2509b;
                EditText editText2 = tVar.f2599f;
                if (editText2 != null) {
                    int selectionEnd = editText2.getSelectionEnd();
                    EditText editText3 = tVar.f2599f;
                    if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        tVar.f2599f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        tVar.f2599f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        tVar.f2599f.setSelection(selectionEnd);
                    }
                    tVar.p();
                    break;
                }
                break;
            default:
                MainActivity mainActivity = (MainActivity) this.f2509b;
                int i2 = MainActivity.f757v;
                mainActivity.getClass();
                Log.d("DynamicInstall", "Update button clicked");
                mainActivity.f759b = true;
                mainActivity.f763g = false;
                mainActivity.f762f = false;
                mainActivity.f764h = false;
                try {
                    Intent intentPrepare = VpnService.prepare(mainActivity);
                    if (intentPrepare != null) {
                        mainActivity.startActivityForResult(intentPrepare, 5678);
                    } else {
                        mainActivity.t();
                    }
                } catch (Exception e3) {
                    Log.e("DynamicInstall", "Error preparing VPN", e3);
                    mainActivity.e();
                    return;
                }
                break;
        }
    }
}
