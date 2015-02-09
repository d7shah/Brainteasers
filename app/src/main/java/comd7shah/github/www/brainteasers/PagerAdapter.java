package comd7shah.github.www.brainteasers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dhrutishah on 15-02-08.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        switch (arg0){
            case 0:
                return new FragmentOne();

            case 1:
                return new FragmentTwo();

            default:
                break;

        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
