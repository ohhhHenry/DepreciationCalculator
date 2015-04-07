package depCalc.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import depCalc.view.DepMetricsPanel;

public class AssetMetricsInputVerifierTest2 {

    private DepMetricsPanel depMetricsPanel;
    private DoubleVerifier verifier;

    @Before
    public void setup() {
        depMetricsPanel = new DepMetricsPanel();
        verifier = new DoubleVerifier(depMetricsPanel);
    }

    @Test
    public void testVerifyWithValidInputForCostReturnsTrue() throws Exception {
        depMetricsPanel.getAssetCost().setText("5");

        assertTrue(verifier.shouldYieldFocus(depMetricsPanel));

    }
}